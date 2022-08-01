package cinema.project.service;

import java.util.List;
import cinema.project.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);
    
    List<CinemaHall> getAll();
}
