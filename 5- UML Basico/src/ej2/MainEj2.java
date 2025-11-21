/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author vlc
 */
public class MainEj2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BT-5000", 5000);
        Celular celular = new Celular("123456789012345", "MarcaX", "ModeloY", bateria);
        Usuario usuario = new Usuario("Carlos Perez", "87654321");

        celular.setUsuario(usuario);

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Celular IMEI: " + usuario.getCelular().getImei());
        System.out.println("Bateria: " + celular.getBateria().getModelo() +
                " - " + celular.getBateria().getCapacidad() + " mAh");
    }
}

