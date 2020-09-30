package agilecraftDataSync.example;

import agilecraftDataSync.example.Controllers.CityController;
import agilecraftDataSync.example.Services.CityService;
import agilecraftDataSync.example.Services.RegionService;
import agilecraftDataSync.example.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import org.thymeleaf.model.IModel;

import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class CityControllerTest {
    @Mock
    CityService cityService;
    @Mock
    RegionService regionService;
    @InjectMocks
    CityController cityController;
    Set<City>cities;

    MockMvc mockMvc;
    @BeforeEach
    void setUp() {
        cities=new HashSet<>();
        cities.add(City.builder().id(2).Name("nrt").RegionID(4).build());
        cities.add(City.builder().id(3).Name("guntur").RegionID(1).build());
        mockMvc = MockMvcBuilders
                .standaloneSetup(cityController)
                .build();
    }




}
