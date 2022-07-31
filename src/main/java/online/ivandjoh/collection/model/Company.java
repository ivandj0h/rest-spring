package online.ivandjoh.collection.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "company_table")
public class Company {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bs;
    private String catchPhrase;
    private String name;
    @OneToOne(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private User user;
}
