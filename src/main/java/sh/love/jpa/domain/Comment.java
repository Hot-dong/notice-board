package sh.love.jpa.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int sn;

    @Column
    private int boardId;

    @Column
    private String writer;

    @Column
    private String content;
}
