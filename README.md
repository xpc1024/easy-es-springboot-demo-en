# easy-es-springboot-demo-en
Demo of easy-es used in Springboot

1. Edit application.yml
    ```yaml
    easy-es:
    address: 127.0.0.0:9200 # Your elasticsearch address,must contains port, If it is a cluster, please separate with',' just like this: 127.0.0.0:9200,127.0.0.1:9200
    ```
2. Run your project with IDE

3. Use your browser or postman to request the following addresses in turn:
   - http://localhost:8080/index (create index, must be requested first and only once)
   - http://localhost:8080/insert (create data)
   - http://localhost:8080/search (search data)
   
>Then you will get the result what you searched in your browser or postman.

---

## Summary
> At this point, you have initially experienced the basic functions of Easy-Es. If you feel that the experience is good, and you want to further experience more powerful functions, you can check the reference document