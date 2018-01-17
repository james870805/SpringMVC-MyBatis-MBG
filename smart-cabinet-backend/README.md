1. Mybatis Generator, generate DAO, Mapper and Model(Entity) file
- Open generatorConfig.xml, edit table section(between <table></table>)
- Run Configuration -> Maven Build -> set Goal to: mybatis-generator:generate -> Run

2. Deploy to Tomcat, visit with this URL: http://localhost:8080/scbe/api/operation-record/all