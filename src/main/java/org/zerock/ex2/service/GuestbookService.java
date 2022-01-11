package org.zerock.ex2.service;

import org.zerock.ex2.dto.GuestbookDTO;
import org.zerock.ex2.dto.PageRequestDTO;
import org.zerock.ex2.dto.PageResultDTO;
import org.zerock.ex2.entity.Guestbook;

public interface GuestbookService {

    Long register(GuestbookDTO dto);

    GuestbookDTO read(Long gno);

    void remove(Long gno);

    void modify(GuestbookDTO dto);

    PageResultDTO<GuestbookDTO, Guestbook> getList(PageRequestDTO requestDTO);

    default Guestbook dtoToEntity(GuestbookDTO dto) {
        Guestbook entity = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return entity;
    }

    default GuestbookDTO entityTODto(Guestbook entity){

        GuestbookDTO dto = GuestbookDTO.builder()
                .gno(entity.getGno())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writer(entity.getWriter())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();
        return dto;
    }

}
