package ServletStudy.model;

import lombok.Data;

/**
 * @title: Book
 * @Author Xu
 * @Date: 11/11/2022 下午 5:12
 * @Version 1.0
 */
@Data
public class Book {
    private static final long serialVersionUID=1L;
    private String id;
    private String name;
    public Book() {
    }
    public Book(String id,String name) {
        this.id=id;
        this.name=name;
    }
}
