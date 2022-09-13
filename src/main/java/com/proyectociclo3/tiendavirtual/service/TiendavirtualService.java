package com.proyectociclo3.tiendavirtual.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectociclo3.tiendavirtual.domain.Tiendavirtual;

@Service
public class TiendavirtualService {

    public List<Tiendavirtual> buscarDestacados() {
        List<Tiendavirtual> destacados = new ArrayList<>();

        Tiendavirtual tienda=new Tiendavirtual();
        tienda.setNombre("Esteras de descanso");
        tienda.setDescripcion("Hamiledyi Alfombra de reptil estera terrario sustrato Liner Ropa de cama Lizard Suministros de sustrato Jaula de reptiles.");        
        tienda.setImagenUrl("https://m.media-amazon.com/images/I/71OHW+FjjuL._AC_UL960_FMwebp_QL65_.jpg");


        tienda.setNombre("Comedero Dosificador Doble Uso");
        tienda.setDescripcion("Comedero dosificador doble uso ideal para tu mascota, tiene dos compartimientos para agua y comida, especialmente cuando tu mascota debe quedarse mucho tiempo sola en casa..");        
        tienda.setImagenUrl("https://m.media-amazon.com/images/I/71GYpuVYDxL._AC_UL960_QL65_.jpg");


        tienda.setNombre("Pelota Nudo Multicolor");
        tienda.setDescripcion("Pelota nudo multicolor disponible en dos tamaños, PEQUEÑA Y GRANDE, ideal para gatos y perros de razas pequeñas.");        
        tienda.setImagenUrl("https://www.ammascotas.com/wp-content/uploads/2016/11/pelotanuedomulticolor.jpg");

        tienda.setNombre("Dispensador interactivo");
        tienda.setDescripcion("Dispensador de golosinas para perros/gatos, rompecabezas para perros/gatitos, vaso interactivo para cachorros y gatitos, juguete de bola");        
        tienda.setImagenUrl("https://m.media-amazon.com/images/I/71Wgr+-AtnL._AC_SL1500_.jpg");

        tienda.setNombre("Muñeco de Desestres");
        tienda.setDescripcion("Juguetes de peluche para perros chirriantes. Juguete de felpa resistente para masticar.");        
        tienda.setImagenUrl("https://m.media-amazon.com/images/I/71cSuZQJXNL._AC_UL960_QL65_.jpg");


        tienda.setNombre("Rejas Divisorias");
        tienda.setDescripcion("Puerta para perro, de 65 cms de altura, incluye accesorios de instalación y decoración de paneles de madera.");        
        tienda.setImagenUrl("https://m.media-amazon.com/images/I/81IT9UlGXPL._AC_UL800_QL65_.jpg");
        
        
        tienda.setNombre("Juguetes chirriantes");
        tienda.setDescripcion("Juguetes chirriantes duraderos de peluche interactivos para perros, juguetes masticables para cachorros pequeños, medianos y grandes");        
        tienda.setImagenUrl("https://m.media-amazon.com/images/I/71OHW+FjjuL._AC_UL960_FMwebp_QL65_.jpg");
        
        
        tienda.setNombre("Removedor de Pelusa");
        tienda.setDescripcion("Rodillo removedor de pelusa multisuperficie para perros y gatos, ecológico y reutilizable.");        
        tienda.setImagenUrl("https://m.media-amazon.com/images/I/81zjo9UGQPL._AC_UL800_QL65_.jpg");
        

        
        return destacados;
    }
    
}
