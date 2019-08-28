package com.work.service.v3;

import com.work.api.v3.user.RequesterUserLoginApi;
import com.work.common.BaseRequester;
import com.work.common.Constants;
import com.work.common.PasswordUtils;
import com.work.common.SQLAdapter;
import com.work.entity.AppLoginUser;
import com.work.mappercommon.CommonMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by changzhou on 2017/4/19.
 */
@Service("userService")
public class UserService extends BaseRequester {

    @Resource
    private CommonMapper commonMapper;

    public AppLoginUser selectUserById(String id) {
        AppLoginUser appLoginUser = new AppLoginUser();
        String sql = "SELECT \n" +
                "t.FD_AUTOGRAPH AS atigraph, \n" +
                "t1.FD_HIREDATE AS birthday, \n" +
                "t.FD_HEADICON AS headimg, \n" +
                "FD_HXPASSWORD AS hxpassword, \n" +
                "FD_HXUSERNAME AS hxusername,\n" +
                "fd_username AS userid, \n" +
                "t.fd_password AS password, \n" +
                "t.fd_name AS name, \n" +
                "t.FD_MOBPHE AS phone, \n" +
                "'初级' AS rank, \n" +
                "0 AS integral,\n" +
                "decode(t1.fd_gender, '男', '0', '女', '1',null,'0') AS sex, \n" +
                "t.FD_USERTYPE AS type, \n" +
                "t1.fd_orgcde AS orgid, \n" +
                "replace(replace(t1.fd_unitnme, '中国银行辽宁省分行', ''), '中国银行') AS orgname, \n" +
                "t2.nodename2 AS parentname,\n" +
                "t2.nodecode2 AS parentid, \n" +
                "t3.fd_longitude AS longitude,\n" +
                "t3.fd_latitude AS latitude, \n" +
                "t.FD_BIZPHE AS telephone\n" +
                "FROM TB_SYS_USERINFO t\n" +
                "\tLEFT JOIN tb_pepmgm_empinfo t1 ON t.fd_username = t1.fd_empid\n" +
                "\tLEFT JOIN tb_sys_orginfoext t2 ON t1.fd_orgcde = t2.nodecode6\n" +
                "\tLEFT JOIN tb_app_bank_index t3 ON t1.fd_orgcde = t3.fd_orgid\n" +
                "WHERE t.fd_username = '" + id + "'\n";
        List<Map<String, Object>> list = commonMapper.selectCommonSql(new SQLAdapter(sql));
        if (list.size() == 0) {
            return null;
        } else {
            Map<String, Object> map = list.get(0);
            appLoginUser.phone = ObjectUtils.toString(map.get("PHONE"));
            appLoginUser.token = ObjectUtils.toString(map.get("TOKEN"));
            appLoginUser.name = ObjectUtils.toString(map.get("NAME"));
            appLoginUser.sex = Integer.valueOf(ObjectUtils.toString(map.get("SEX")));
            appLoginUser.headimg = ObjectUtils.toString(map.get("HEADIMG"));
            appLoginUser.birthday = ObjectUtils.toString(map.get("BIRTHDAY"));
            appLoginUser.atigraph = ObjectUtils.toString(map.get("ATIGRAPH"));
            appLoginUser.integral = Integer.valueOf(ObjectUtils.toString(map.get("INTEGRAL")));
            appLoginUser.rank = ObjectUtils.toString(map.get("RANK"));
            appLoginUser.hxusername = ObjectUtils.toString(map.get("HXUSERNAME"));
            appLoginUser.hxpassword = ObjectUtils.toString(map.get("HXPASSWORD"));
            appLoginUser.type = ObjectUtils.toString(map.get("TYPE"));
            appLoginUser.password = ObjectUtils.toString(map.get("PASSWORD"));
            appLoginUser.userid = ObjectUtils.toString(map.get("USERID"));
            appLoginUser.orgid = ObjectUtils.toString(map.get("ORGID"));
            appLoginUser.orgname = ObjectUtils.toString(map.get("ORGNAME"));
            appLoginUser.parentid = ObjectUtils.toString(map.get("PARENTID"));
            appLoginUser.parentname = ObjectUtils.toString(map.get("PARENTNAME"));
            appLoginUser.longitude = ObjectUtils.toString(map.get("LONGITUDE"));
            appLoginUser.latitude = ObjectUtils.toString(map.get("LATITUDE"));
            appLoginUser.telephone = ObjectUtils.toString(map.get("TELEPHONE"));
        }
        return appLoginUser;
    }

    /**
     * @param req
     * @param res
     * @description
     */
    public void userLogin(RequesterUserLoginApi.Params req, RequesterUserLoginApi.Response res) {
        try {
            if (empty(req.phoneType) || empty(req.version)) {
                res.header = getFail("请升级到最新版本");
            } else {
                if (empty(req.userid) || empty(req.password)) {
                    res.header = getFail("账号密码不能为空");
                } else {
                    AppLoginUser appLoginUser = selectUserById(req.userid);
                    if (appLoginUser == null) {
                        res.header = getFail("账号不存在");
                    } else {
                        if (!appLoginUser.password.equals(PasswordUtils.encrypt(req.password))) {
                            res.header = getFail("账号密码错误");
                        } else {
                            res.data.user = appLoginUser;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constants.SERVER_ERROE_MSG);
        }
    }

}
