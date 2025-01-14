#第一個Project獻給 DAO
DAO的認知大概在實習期間有所突破
在JDBC、MyBatis、JPA、Redis那麼多方法下，可以知道要使用DAO(interface)來做一個模板
然後在用這些方法去實作DAO，千篇一律都是CRUD，但是用的技術卻不太一樣
就跟造房子一樣，知道架構怎麼做，剩下的只是選擇建材而已

- DAO(interface)
- DAOException(class)
  - DAORepository(JPA)
  - (DAOMapper)(myBatis)
    -  DAOImpl(class)
create 2025/01/14

