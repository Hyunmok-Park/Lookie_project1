package org.zerock.ex2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;
import org.zerock.ex2.entity.Memo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
class MemoRepositoryTest {

    @Autowired
    MemoRepository memoRepository;

//    @Test
//    public void testInsertDummies() {
//        IntStream.rangeClosed(1,100).forEach(i -> {
//            Memo memo = Memo.builder().memoText("Sampel..."+i).build();
//            memoRepository.save(memo);
//        });
//    }

//    @Test
//    public void testSelect(){
//        Long mno = 100L;
//
//        Optional<Memo> result = memoRepository.findById(mno);
//
//        System.out.println("=================");
//
//        if(result.isPresent()){
//            Memo memo = result.get();
//            System.out.println(memo);
//        }
//    }

//    @Test
//    public void testPageDefault(){
//        Pageable pageable = PageRequest.of(0,10);
//        Page<Memo> result = memoRepository.findAll(pageable);
//        System.out.println(result);
//    }
//
//    @Test
//    public void testQueryMethods(){
//        List<Memo> list = memoRepository.findByMnoBetweenOrderByMnoDesc(70L, 80L);
//
//        for (Memo memo : list){
//            System.out.println(memo);
//        }
//    }

//    @Test
//    public void testQueryMethodWithPageable(){
//        Pageable pageable = PageRequest.of(0, 10, Sort.by("mno").descending());
//        Page<Memo> result = memoRepository.findByMnoBetween(10L,50L, pageable);
//        result.get().forEach(memo -> System.out.println(memo));
//    }
    @Commit
    @Transactional
    @Test
    public void testDeleteQueryMethods(){
        memoRepository.deleteMemoByMnoLessThan(10L);
    }
}

