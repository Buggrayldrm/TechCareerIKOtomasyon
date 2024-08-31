package com.example.IKOtomasyon.IKOtomasyon.Services.concretes;

import com.example.IKOtomasyon.IKOtomasyon.Dto.Request.PositionCreateRequest;
import com.example.IKOtomasyon.IKOtomasyon.Dto.Response.PositionResponseDto;
import com.example.IKOtomasyon.IKOtomasyon.Entities.Position;
import com.example.IKOtomasyon.IKOtomasyon.Repository.PositionRepository;
import com.example.IKOtomasyon.IKOtomasyon.Services.abstracts.PositionService;
import com.example.IKOtomasyon.IKOtomasyon.Services.adapters.PositionAdapter;
import com.example.IKOtomasyon.IKOtomasyon.Services.concretes.Positions.AddPositionCommand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PositionBusiness implements PositionService {
    private final PositionRepository positionRepository;
    private final PositionAdapter positionMapper;
    @Override
    public List<PositionResponseDto> getAllPosition() {
       List<Position> positions=positionRepository.findAll();
       List<PositionResponseDto> dtos=positionMapper.convertToListResponseDto(positions);
       return dtos;
    }

    @Override
    public PositionResponseDto getByIdPosition(@PathVariable Long id) {
        Position position=positionRepository.findById(id).orElse(null);
        return positionMapper.convertToResponceDto(position);
    }

    @Override
    public void deleteOnePosition(Long id) {
        positionRepository.deleteById(id);
    }

    @Override
    public Position createOnePosition(PositionCreateRequest positionCreateRequest) {
        Position position=positionMapper.convertToEntity(positionCreateRequest);
    return positionRepository.save(position);
    }

    @Override
    public Position updateOnePosition(Long id, Position newPosition) {

        return null;
    }
}
