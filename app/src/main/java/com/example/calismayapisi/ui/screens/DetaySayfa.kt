package com.example.calismayapisi.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun DetaySayfa(mesaj:String){ //matık aynı istediğin türde veri gönderebilirisn, bir mesaj alırsa
    //detay sayfada şu an sayfa geçişi yok olsaydı burda da navcontroller tanımlanacaktı
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Detay Sayfa", fontSize = 30.sp)

        Text(text = mesaj, fontSize = 20.sp)
    }

    //kaydırarak geri dönüşü engeller
    BackHandler (false) {
        //false ise geçiş izni var, true ise geçiş yok
        //buraya istersen bi kod yazabilirsin, logcat ya da kullanıya geri dönüş geri dönmek ister misiniz gibi vs
    }
}