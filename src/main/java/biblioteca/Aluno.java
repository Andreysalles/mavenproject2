/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author carlos
 */
public class Aluno extends Socio 
{
    private List<Reserva> reserva;

    public Aluno() 
    {
        super(nome);
        this.reserva = new ArrayList<>();
    }
    
}
