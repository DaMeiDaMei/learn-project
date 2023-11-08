package com.chinalife;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * EnableJpaRepositories  注解来激活Spring Data JPA Repository, basePackage指定了Repository所在的扫描地址
 */
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.chinalife.jpa.dao")
@SpringBootApplication
public class JpaMain {

    public static void main(String[] args) {
        SpringApplication.run(JpaMain.class, args);
    }




    // TODO confirm 根据spring-boot-jpa官方文档的配置，项目启动不起来
//    https://springdoc.cn/spring-data-jpa/#jpa.introduction
//    /**
//     * 配置Hikari数据源
//     * @return 由Hikari管理的数据源
//     */
//    @Bean
//    public DataSource dataSource(){
//        HikariDataSource dataSource = new HikariDataSource();
//        dataSource.setDriverClassName("dm.jdbc.driver.DmDriver");
//        dataSource.setJdbcUrl("jdbc:dm://9.23.27.29:5236?compatibleMode=oracle");
//        dataSource.setUsername("SUPERVISION");
//        dataSource.setPassword("SUPERVISION!29yh");
//        dataSource.setReadOnly(false);
//        dataSource.setConnectionTimeout(30000);
//        dataSource.setMaximumPoolSize(6);
//        return dataSource;
//    }
//
//    /**
//     * 你必须创建 LocalContainerEntityManagerFactoryBean，而不是直接创建 EntityManagerFactory，因为前者除了创建 EntityManagerFactory 外，还参与了异常转换机制
//     * 使用Hibernate作为持久化提供者??????
//     *
//     * @return
//     */
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl(true);
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setPackagesToScan("com.chinalife.jpa.entity");
//        factory.setDataSource(dataSource());
//        return factory;
//    }
//
//    /**
//     * JPATransactionManager
//     * @param entityManagerFactory
//     * @return
//     */
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        txManager.setEntityManagerFactory(entityManagerFactory);
//        return txManager;
//    }

//    @Autowired
//    private EmployeeDAO employeeDAO;
//
//    /**
//     * 顺便在这里写个简单的测试吧
//     */
//    @GetMapping("/hibernate/dm/query")
//    public String getPayment(@RequestParam(name="args", required = false)String param){
//
//        Optional<EmployeeEO> data = employeeDAO.findById(1);
//        return data.map(employeeEO -> "hibernate+dm,response:" + employeeEO.getTitle()).orElse(null);
//    }


}
