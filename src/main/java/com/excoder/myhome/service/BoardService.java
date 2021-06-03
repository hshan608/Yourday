package com.excoder.myhome.service;


import com.excoder.myhome.model.Board;
import com.excoder.myhome.model.User;
import com.excoder.myhome.repository.BoardRepository;
import com.excoder.myhome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board){
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
