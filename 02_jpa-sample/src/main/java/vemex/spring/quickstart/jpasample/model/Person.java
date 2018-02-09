package vemex.spring.quickstart.jpasample.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
/**
 * @author wangweiwei
 */
@Entity
@Table(name = "person"
        , catalog = "jpasample"
)
public class Person implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "p_id", unique = true, nullable = false)
    private int id;

    @Column(name = "p_name", length = 45)
   private  String name;

    @Column(name = "p_age")
   private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
