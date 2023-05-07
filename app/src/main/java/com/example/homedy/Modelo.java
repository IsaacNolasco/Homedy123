package com.example.homedy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Modelo {

    public SQLiteDatabase getConn(Context context){
        ConexionSQLite conn = new ConexionSQLite(context, "dbcategorias", null, 1 );
        SQLiteDatabase db = conn.getWritableDatabase();
        return db;

    }

    int insertaCategoria(Context context, CategoriasDTO dto){
        int res = 0;
        String sql ="INSERT INTO usuarios  (id, dolores, golpes, cuidado personal, mascotas, bajar de peso) VALUES('"+dto.getId()+"','"+dto.getDolores()+"','"+dto.getGolpes()
                +"',,'"+dto.getBajar_de_peso()+"','"+dto.getCuidado_personal()+"','"+dto.getMascotas()+"','"+dto.getBajar_de_peso()+"')";
        return res;
    }
}
