package org.zerock.ex2.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.ex2.dto.GuestbookDTO;
import org.zerock.ex2.entity.Guestbook;

@Service
@Log4j2

public class GuestbookServicelmpl implements GuestbookService{
    @Override
    public Long register(GuestbookDTO dto){

        log.info("DTO---------------------");
        log.info(dto);

        Guestbook entity = dtoToEntity(dto);

        log.info(entity);

        return null;
    }
}
