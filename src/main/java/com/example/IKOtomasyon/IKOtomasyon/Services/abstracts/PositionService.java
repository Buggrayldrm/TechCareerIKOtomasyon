package com.example.IKOtomasyon.IKOtomasyon.Services.abstracts;

import com.example.IKOtomasyon.IKOtomasyon.Dto.Request.PositionCreateRequest;
import com.example.IKOtomasyon.IKOtomasyon.Dto.Response.PositionResponseDto;
import com.example.IKOtomasyon.IKOtomasyon.Entities.Position;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


public interface PositionService {

    List<PositionResponseDto> getAllPosition();

    PositionResponseDto getByIdPosition(@PathVariable Long id);

    void deleteOnePosition(Long id);

    Position createOnePosition(PositionCreateRequest positionCreateRequest);

    Position updateOnePosition(Long id,Position newPosition);

}
