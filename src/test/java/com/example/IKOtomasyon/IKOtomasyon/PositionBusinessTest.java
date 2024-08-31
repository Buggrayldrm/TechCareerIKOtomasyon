package com.example.IKOtomasyon.IKOtomasyon;

import com.example.IKOtomasyon.IKOtomasyon.Dto.Request.PositionCreateRequest;
import com.example.IKOtomasyon.IKOtomasyon.Entities.Personal;
import com.example.IKOtomasyon.IKOtomasyon.Entities.Position;
import com.example.IKOtomasyon.IKOtomasyon.Repository.PositionRepository;
import com.example.IKOtomasyon.IKOtomasyon.Services.concretes.PositionBusiness;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PositionBusinessTest {

    @Mock
    private PositionRepository positionRepository;

    @InjectMocks
    private PositionBusiness positionBusiness;

    private Position position;
    private PositionCreateRequest positionCreateRequest;

    @BeforeEach
    void setUp() {
        position = new Position();
        position.setPosition_id(1L);
        Personal personal = new Personal();  // Assuming Personal is another entity
        position.setPersonal_id(personal);
        position.setPosition_name("Developer");

        positionCreateRequest = new PositionCreateRequest();
        positionCreateRequest.setPosition_id(1L);
        positionCreateRequest.setPersonalId(personal);
        positionCreateRequest.setPosition_name("Developer");
    }





    @Test
    void testDeleteOnePosition() {
        doNothing().when(positionRepository).deleteById(1L);

        positionBusiness.deleteOnePosition(1L);

        verify(positionRepository, times(1)).deleteById(1L);
    }

    @Test
    void testCreateOnePosition() {
        when(positionRepository.save(any(Position.class))).thenReturn(position);

        Position createdPosition = positionBusiness.createOnePosition(positionCreateRequest);

        assertNotNull(createdPosition);
        assertEquals(position.getPosition_id(), createdPosition.getPosition_id());
        verify(positionRepository, times(1)).save(any(Position.class));
    }

    @Test
    void testUpdateOnePosition() {
        // Implement this test when you implement the updateOnePosition method in your service
    }
}
