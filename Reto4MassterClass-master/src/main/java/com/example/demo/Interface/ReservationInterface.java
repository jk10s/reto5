/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;
import java.util.List;



/**
 *
 * @author USUARIO
 */
public interface ReservationInterface extends CrudRepository <Reservation, Integer> {

    public List<Reservation> findAllByStatus (String status);

    public List<Reservation> findAllByStartDateAfterAndStartDateBefore (Date datoUno, Date datoDos);

    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationByClient();

    /*



    public List<Reservation> findAllByStartDateAfterAndDevolutionDateBefore(Date fechaA, Date FechaB);
    public List <Reservation> findAllByStatus(String status);
    @Query("SELECT c.client, COUNT(c.client) FROM Reservation AS c GROUP BY c.client ORDER BY COUNT(c.client) DESC");

     */
}
