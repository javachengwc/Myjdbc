哈哈测试
源码贡献者<br />
北京-null，北京-企鹅<br />

最新更新说明：Myjdbc_branch分支已支持二级缓存策略<br />

#本持久层框架的功能支持：<br />
##1、支持ORACLE，MYSQL，SQL Server数据库的增删改查的sql语句<br />
##2、支持分布式二级缓存策略<br />
##3、数据库分库分表正在准备中......<br />
#项目优点：<br />
##1、几乎零配置的持久层框架，更加简洁爽快的代码编写方式，DBHelper随处new随处用。和其他持久层框架不产生任何冲突。侵入性极高。<br />
##2、代码可维护性高，架构简单灵活；可定制性的功能需求，满足奇葩业务。基于SQLEntity对象的总线模式架构。<br />
##3、多数据源操作简单。<br />
##4、采用redis sql结果集缓存策略，比JDBC原生API在整体性能上，提高一个数量级的性能。基于二级缓存有利于分布式扩展。<br />
#缺点：<br />
##1、仅支持弱分布式事务管理。对数据一致性没有保障。<br />
##2、暂时不支持二级缓存Key分布式策略<br />
##3、暂时不支持分库分表，读写分离<br />
##4、二级缓存仅只支持druid数据源<br />

#注意事项
##本框架旨在调试方便，开发方便，保证源码的可维护性，一旦你用了这个框架，意味着你要对可能出现的bug付全部责任。如果生产过程中，使用本框架出现任何问题造成的经济损失，本人以及源码贡献者将不承担任何法律责任。

#联系方式
##QQ：429544557
##邮箱：429544557@qq.com
再来一次
