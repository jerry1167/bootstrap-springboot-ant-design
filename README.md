# A Springboot & Ant Design Scaffold Project

## Features

1. Bootstrap Springboot project
2. Bootstrap [Ant Design Pro](https://pro.ant.design/zh-CN/docs/overview) with Node.js, React.js, TypeScript.js
3. [Release use Springboot with Frontend as static resources](https://pro.ant.design/zh-CN/docs/deploy)
4. With Multiple env configuration
    - Frontend mock/dev/prod 
    - Backend dev/prod
5. Authentication By Wechat OAuth2
    - Ant Design Permission Management [@umijs/plugin-access](https://umijs.org/zh-CN/plugins/plugin-access)
    - Springboot OAuth2 and Session management
    - [Wechat OAuth2]()
6. [Release APP with Electron](https://www.electronjs.org/docs/latest/tutorial/quick-start) (Optional)


## How to Use

### Ant Design/Frontend Alone

Install `node_modules`:

```bash
npm install
```

Start project

```bash
npm start
```

### Startup As One Service 

First, Compile project 
```bash
mvn install -DdownloadSources -U 
```

Second, Run then [Sprintboot Application](https://spring.io/guides/gs/spring-boot/)

```bash
./mvnw spring-boot:run
```

## Beginners: Things You Have to Learn
### Front-end
![AntdDesignPro](https://gw.alipayobjects.com/zos/antfincdn/AhUzrugUr%26/yuque_diagram.jpg)

### Backend

- Springboot
- Persistent Layer
    - Druid JDBC
    - Database: [H2 Database](https://www.h2database.com/html/main.html)
    - [Tk Mybatis](https://github.com/abel533/Mapper/wiki)