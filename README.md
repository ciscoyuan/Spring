# Spring
<b>简介</b>:悍跳的语言表示不太会ui,所以界面就别太建议了...<br>
<br>准备先做一个分布式流计算虚拟币交易系统.后续会慢慢把disruotor,redis,netty弄进来...storm就不要了...不太好用...
<h2>MODEL<h2>
<h4>final<h4>
根目录.放置通用jar包.
<br><br>
<h4>final-common<h4>
放置业务模块的公共类.
<br><br>
<h4>final-api<h4>
<p>dubbox提供rest服务的模块.所以需要安装dubbox和api.用dubbox后就不用每次再用httpclient来调用了,会相对方便些.</p>
给出下载地址和下载后的cmd命令.<br>网盘链接: https://pan.baidu.com/s/1eRUQ7XC 
安装到jar包到仓库
mvn install:install-file -Dfile=D:\apache-tomcat-7.0.52\webapps\spring1\WEB-INF\lib\dubbo-demo-api-2.8.4.jar  -DgroupId=com.final -DartifactId=dubbox.api -Dversion=2.8.4 -Dpackaging=jar
<br><br>
<h4>final-common-kit<h4>
放置配置文件
<br><br>
<h4>final-sys<h4>
用户和商品模块
<br><br>
<h4>final-ui<h4>
所有service都加载到这一个容器里,也是启动模块.目前仅有login.jsp,一个文件上传的页面.
<br><br>
<h4>final-bank<h4>
银行模块
<br><br>
<h4>final-order<h4>
订单模块
<br><br>
<h4>final-quotation<h4>
实时行情模块
<br><br>
<h4>final-acc<h4>
金额账户模块
<br><br>
<h4>final-generator<h4>
获取数据库连接通过插件,模板和generator生成 model,mapper,service和controller.


