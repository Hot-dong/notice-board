package sh.love.jpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int sn;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Date dt = new Date();

    @Column
    private String tag;

    @Column
    private String boardCd;

    @OneToMany
    @JoinColumn(name = "boardId")
    private List<Comment> commentList;
}
