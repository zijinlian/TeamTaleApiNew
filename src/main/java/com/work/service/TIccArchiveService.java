package com.work.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.work.bean.*;
import com.work.entity.*;
import com.work.mapper.xml.TIccStaffPaperNewMapper;
import com.work.mapper.xml.TbIccProblemDeptMapper;
import net.sf.json.JSONException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.work.common.Constants;
import com.work.common.DateUtil;
import com.work.common.HttpUploadFile;
import com.work.common.JSONResult;
import com.work.common.UUIDGeneratorUtil;
import com.work.entity.TCheckFinalListExample.Criteria;
import com.work.mapper.TCheckFinalItemsMapper;
import com.work.mapper.TCheckFinalListMapper;
import com.work.mapper.TCheckItemsMapper;
import com.work.mapper.TCheckListMapper;
import com.work.mapper.TChickStaffMapper;
import com.work.mapper.TIccArchivesMapper;
import com.work.mapper.TIccMathMapper;
import com.work.mapper.TIccStaffPaperMapper;
import com.work.mapper.TIccStaffStatusMapper;
import com.work.mapper.TPubAttachinfoMapper;
import com.work.mapper.TPubAttachrelMapper;

/**
 * 合规档案
 * @author zhoucha
 *
 */
@Service
public class TIccArchiveService {
	
	@Resource
	private TIccArchivesMapper archivesMapper;
	
	@Resource
	private TIccMathMapper mathMapper;
	
	@Resource
	private TIccStaffPaperMapper staffPaperMapper;
	
	@Resource
	private TCheckFinalListMapper checkFinalListMapper;
	
	@Resource
	private TCheckFinalItemsMapper checkFinalItemsMapper;
	
	@Resource
	private TCheckItemsMapper  checkItemsMapper;
	
	@Resource
	private TIccStaffStatusMapper iccStaffStatusMapper;
	
	@Resource
	private TChickStaffMapper chickStaffMapper;
	
	@Resource
	private TPubAttachrelMapper attachrelMapper;
	
	@Resource
	private TPubAttachinfoMapper attachinfoMapper;
	
	@Resource
	private TCheckListMapper checkListMapper;

    @Resource
    private TbIccProblemDeptMapper tbIccProblemDeptMapper;

    @Resource
    private TIccStaffPaperNewMapper tIccStaffPaperNewMapper;

	
	/**
	 * 合规档案列表
	 * @param bean
	 * @return
	 */
	public JSONResult selectListArchive(PageBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TIccArchivesExample archivesExample = new TIccArchivesExample();
			archivesExample.createCriteria();
			PageHelper.startPage(bean.getPage(), bean.getPageSize(),"FD_ARCHIVES_H DESC");
			List<TIccArchives> list = archivesMapper.selectByExample(archivesExample);
			result.getBody().put("list", list);
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}

    /**
     * 查询合规测试试卷试题表
     * @param bean
     * @return
     */
    public JSONResult selectListNewMath(Map<String,String> bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            TIccMathExample example = new TIccMathExample();
            example.createCriteria().andFdMathsDateEqualTo(DateUtil.defaultFormat(new Date())).andFdMathsStatusEqualTo("0");
            List<TIccMath> list = mathMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(list)){
                result = JSONResult.getFail("今天暂无试题");
            }else{
                TIccMath maths = list.get(0);
                List<Map<String,Object>> problems = mathMapper.selectNewMathProblem(bean.get("deptId"));
                result.getBody().put("maths", maths);
                result.getBody().put("problems", problems);
            }
        } catch (JSONException je) {
            je.printStackTrace();
            result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
        return result;
    }


    /**
     * 查询合规测试试卷试题表
     * @param bean
     * @return
     */
    public JSONResult selectListMath(Object bean) {
        JSONResult result = JSONResult.getSuccess();
        try {
            TIccMathExample example = new TIccMathExample();
            example.createCriteria().andFdMathsDateEqualTo(DateUtil.defaultFormat(new Date())).andFdMathsStatusEqualTo("0");
            List<TIccMath> list = mathMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(list)){
                result = JSONResult.getFail("今天暂无试题");
            }else{
                TIccMath maths = list.get(0);
                List<Map<String,Object>> problems = mathMapper.selectMathProblem(maths.getFdMathsId());
                result.getBody().put("maths", maths);
                result.getBody().put("problems", problems);
            }
        } catch (JSONException je) {
            je.printStackTrace();
            result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
            throw new RuntimeException("运行时出错！");
        }
        return result;
    }
	
	/**
	 * 判断用户当天是否合规测试过
	 * @param bean
	 * @return
	 */
	public JSONResult selectIccStafStatusByUserAndDate(IccStaffPaperBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TIccStaffStatusExample example = new TIccStaffStatusExample();
			example.createCriteria().andFdStaffIdEqualTo(bean.getFdStaffId()).andFdStaffStatusDateEqualTo(DateUtil.defaultFormat(new Date()));
			List<TIccStaffStatus>list = iccStaffStatusMapper.selectByExample(example);
			if(list!= null && list.size()>0){
				result.getBody().put("isExam", true);
				result.getBody().put("list", list);
			}else{
				result.getBody().put("isExam", false);
			}
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}

    /**
     * 新的保存合规测试试卷答案
     * @param bean
     * @return
     */
	public JSONResult saveAnswerNew(TbIccStaffPaperNewBean bean){
	    JSONResult result = JSONResult.getSuccess();
        try {
            Integer a = tIccStaffPaperNewMapper.selectCount(bean.getAnswers().get(0));
            if (null == a) {a=1;}else {++a;}
            for (TbIccStaffPaperNewBean paperBean : bean.getAnswers()) {
                    TbIccStaffPaperNew paper = new TbIccStaffPaperNew();
                BeanUtils.copyProperties(paper, paperBean);
                paper.setPaperTy(a+"");
                tIccStaffPaperNewMapper.insertSelective(paper);
            }
        } catch (Exception e) {
            return JSONResult.getFail("不能重复提交");
        }
        return result;
    }
	/**
	 * 保存合规测试试卷答案
	 * @param bean
	 * @return
	 */
	public JSONResult saveAnswer(IccStaffPaperBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			String staffId = "";
			String fdPaperId = "";
			Integer fdStaffScore = 0;
			for (IccStaffPaperBean paperBean : bean.getAnswers()) {
				TIccStaffPaper paper = new TIccStaffPaper();
				staffId = paperBean.getFdStaffId();
				fdPaperId = paperBean.getFdPaperId();
				fdStaffScore += Integer.valueOf(StringUtils.defaultString(paperBean.getFdStafffScore(), "0"));
				BeanUtils.copyProperties(paper, paperBean);
				TIccStaffPaperKey key = new TIccStaffPaperKey();
				key.setFdPaperId(paper.getFdPaperId());
//				key.setFdProblemId(paper.getFdProblemId());
				key.setFdStaffId(paper.getFdStaffId());
				key.setFdStaffPaperDate(paper.getFdStaffPaperDate());
				TIccStaffPaper iccStaffPaper = staffPaperMapper.selectByPrimaryKey(key);
				if(iccStaffPaper!=null){
					return JSONResult.getFail("不能重复提交");
				}
				staffPaperMapper.insertSelective(paper);
			}
			TIccStaffStatus staffStatus = new TIccStaffStatus();
			staffStatus.setFdStaffId(staffId);
			staffStatus.setFdPaperId(fdPaperId);
			staffStatus.setFdStaffScore(String.valueOf(fdStaffScore));
			staffStatus.setFdStaffStatusDate(DateUtil.defaultFormat(new Date()));
			iccStaffStatusMapper.insertSelective(staffStatus);
			/*TIccMath iccMath = mathMapper.selectByPrimaryKey(fdPaperId);
			iccMath.setFdMathsStatus("1");
			mathMapper.updateByPrimaryKeySelective(iccMath);*/
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}
	
	
	/**
	 * selectCheckFinal
	 * @param bean
	 * @return
	 */
	public JSONResult selectCheckFinalList(IccStaffPaperBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TChickStaffExample  chickStaffExample = new TChickStaffExample();
			chickStaffExample.createCriteria().andFdStaffIdEqualTo(bean.getFdStaffId());
			List<TChickStaff> listChickStaffs = chickStaffMapper.selectByExample(chickStaffExample);
			if(CollectionUtils.isEmpty(listChickStaffs)){
				result = JSONResult.getFail("查询不到检查用户");
			}else{
				TChickStaff chickStaff = listChickStaffs.get(0);
				TCheckFinalListExample example = new TCheckFinalListExample();
				Criteria criteria = example.createCriteria();
				criteria.andFdFinalListStatusEqualTo("2").andFdFinalListDateEqualTo(DateUtil.defaultFormat(new Date())).andFdCheckFinalBodiesIdEqualTo(chickStaff.getFdBodiesId());
				Criteria criteria2 = example.createCriteria();
				example.or(criteria2.andFdFinalListStatusEqualTo("4").andFdCheckFinalBodiesIdEqualTo(chickStaff.getFdBodiesId()));
				PageHelper.startPage(bean.getPage(), bean.getPageSize());
				List<TCheckFinalList> list = checkFinalListMapper.selectByExample(example);
				result.getBody().put("list", list);
			}
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}
	
	/**
	 * 检查项
	 * @param bean
	 * @return
	 */
	public JSONResult selectCheckItemList(CheckFinalItemsBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TCheckListExample checkListExample = new TCheckListExample();
			checkListExample.createCriteria();
			List<TCheckList> listCheckLists = checkListMapper.selectByExample(checkListExample);
			for (TCheckList tCheckList : listCheckLists) {
				TCheckItemsExample example = new TCheckItemsExample();
				example.createCriteria().andTbListIdEqualTo(tCheckList.getTbListId());
				List<TCheckItems> list = checkItemsMapper.selectByExample(example);
				result.getBody().put("list", list);
			}
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}
	
	
	/**
	 * 修改检查项
	 * @param bean
	 * @return
	 */
	public JSONResult updateCheckItem(CheckFinalListBean bean,MultipartFile[] files) {
		JSONResult result = JSONResult.getSuccess();
		try {
			String fdAttachRelId = UUIDGeneratorUtil.generate();
			TCheckFinalList finalList = new TCheckFinalList();
			BeanUtils.copyProperties(finalList, bean);
			finalList.setFdAttachRelId(fdAttachRelId);
			checkFinalListMapper.updateByPrimaryKeySelective(finalList);
			for (CheckFinalItemsBean itemsBean : bean.getItems()) {
				TCheckFinalItems items = new TCheckFinalItems();
				BeanUtils.copyProperties(items, itemsBean);
				items.setFdFinalItemsId(UUIDGeneratorUtil.generate());
				items.setFdFinalListId(bean.getTbCheckFinalListId());
				checkFinalItemsMapper.insertSelective(items);
			}
			
			if(files!=null && files.length>0){
				List<String> imgs = HttpUploadFile.uploadToImageServer(files);
				for (String img : imgs) {
					String fdAttachid = UUIDGeneratorUtil.generate();
					TPubAttachinfo attachinfo = new TPubAttachinfo();
					attachinfo.setFdAttachid(fdAttachid);
					attachinfo.setFdAttachtyp("1");
					attachinfo.setFdStorepath(img);
					attachinfo.setFdValidflag(BigDecimal.valueOf(1l));
					attachinfo.setFdComments("内控");
					attachinfo.setFdUploadtime(DateUtil.formatDate(new Date()));
					attachinfoMapper.insertSelective(attachinfo);
					
					
					TPubAttachrel attachrel = new TPubAttachrel();
					attachrel.setFdAttachrelid(fdAttachRelId);
					attachrel.setFdAttachid(fdAttachid);
					attachrel.setFdAttachtyp("1");
					attachrel.setFdAttachdes("内控");
					attachrel.setFdRectmodiftime(DateUtil.formatDate(new Date()));
					attachrel.setFdValidflag(BigDecimal.valueOf(1l));
					attachrelMapper.insertSelective(attachrel);
				}
			}
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}

    /**
     * 通过试题所属部门ID查询当前试题所选部门名称
     * @param
     * @return
     */
    public JSONResult selectProblemDeptList() {
        JSONResult success = JSONResult.getSuccess();
        List<TbIccProblemDept> tbIccProblemDepts = tbIccProblemDeptMapper.selectTbIByProDepId();
        success.getBody().put("map",tbIccProblemDepts);
        return success;
    }
}
