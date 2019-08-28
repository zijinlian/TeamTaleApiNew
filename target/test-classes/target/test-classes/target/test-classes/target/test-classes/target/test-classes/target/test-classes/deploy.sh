#!/usr/bin/expect

spawn scp ./target/TeamTaleApi.war appapi@39.104.168.56:/usr/local/tomcat/webapps/TeamTaleApi.war
expect "*password:"
send "appapi\r"
#expect "*#"
interact
#expect -c "
#    spawn scp ./target/house.war fangzhen@www.fangyygw.com:/home/apache-tomcat-7.0.55/webapps/house.war
#    expect {
#        \"*assword\" {set timeout 300; send \"fangyygw\r\";}
#        \"yes/no\" {send \"yes\r\"; exp_continue;}
#    }
#    expect eof
#"
#
#expect -c "
#    spawn ssh root@www.fangyygw.com \"ls;\" \"pwd;\"
#    expect {
#        \"*assword\" {set timeout 300; send \"fangyygw\r\";}
#        \"yes/no\" {send \"yes\r\"; exp_continue;}
#    }
#    expect eof
#"

#spawn ssh root@www.fangyygw.com
#expect "*password:"
#send "fangyygw\r"
#expect "*#"
#interact
