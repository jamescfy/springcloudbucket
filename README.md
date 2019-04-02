# springcloudbucket
a family bucket for springcloud learner

快速开始
如果你还没有克隆项目。
git clone https://github.com/lishuo9527/MybatisGenerator-UI.git
使用代码构建项目
cd MybatisGenerator-UI
mvn clean package -Dmaven.test.skip
如果需要，可以从application.properties文件更改默认服务器端口。
### Default server port #########
server.port=8888
使用如下命令从命令行运行它：
cd target/
nohup java -server -Xms128m -Xmx128m -jar MybatisGenerator-1.0.0-SNAPSHOT.jar  >out.log 2>&1 &
您也可以在Eclipes或IntelliJ IDEA中运行它。找到课程me.lishuo.MybatisGeneratorApplication并运行它。

访问服务器为 http://localhost:8888

去做
支持更多数据库（现在只支持MySQL）
优化代码
添加系统配置（完成）
执照
Mybatis Generator UI在MIT许可下发布。
