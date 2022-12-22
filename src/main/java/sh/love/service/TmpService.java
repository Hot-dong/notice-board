package sh.love.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sh.love.jpa.domain.Board;
import sh.love.jpa.domain.Comment;
import sh.love.jpa.repository.BoardRepository;
import sh.love.jpa.repository.CommentRepository;
import sh.love.model.TmpBoard;
import sh.love.model.TmpComment;

import java.util.List;

@Service
public class TmpService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private CommentRepository commentRepository;

    public void save(TmpBoard tmpBoard) {
        ModelMapper modelMapper = new ModelMapper();
        Board board = modelMapper.map(tmpBoard, Board.class);
        boardRepository.save(board);
    }

    public List<Board> list(){
        return boardRepository.findAll();
    }

    public Board get(int sn) {
        return boardRepository.findById(sn).get();
    }

    public void commentSave(TmpComment tmpComment) {
        ModelMapper modelMapper = new ModelMapper();
        Comment comment = modelMapper.map(tmpComment, Comment.class);
        commentRepository.save(comment);

    }
}
