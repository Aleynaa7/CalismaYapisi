package com.example.calismayapisi.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Anasayfa(navController: NavController){
    val sayac = remember { mutableStateOf(0) }

    //bunlar tam olarak ne??
    //sayfanın görünmesi ile ilgili bi algoritma gerekiyorsa
    //aşağıda kedi işareti yani logcat kısmından görürsün
    LaunchedEffect(true) {
        Log.e("Anasayfa", "LaunchedEffect çalıştı") // e ile yazmak daha iyi renkli yazar
        //sayfa her göründüğünde çalışır
        //sayfaya geri dönüldüğünde de çalışır
    }
    DisposableEffect(Unit) {
        onDispose {
            Log.e("Anasayfa", "DisposableEffect çalıştı")
            //her görünmez olduüunda çalışır
        }
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Anasayfa", fontSize = 30.sp)
        Text(text = "Sayaç : ${sayac.value}" , fontSize = 20.sp)
        Button(onClick = {
            //state management: arayüzde güncelleme yapmak ve bunu sayfayı yüklyeyerek yapmak : arayüzde değişim istiyorsam butona bastığında sayfa yüklenerek yapmalısın, hızlı yükleme olur anlmaazsın
            //state management denilen yapılar çıkar yani mesela sadece orayı gümncelle gibi (şu an column ne varsa tmamanını baştan yüklüyor)
            //değişken baalı çalışır, onun değeri depişince asa yüz gündelleneceke şekilde ayarlanır
            sayac.value = sayac.value + 1
            //yaşam döngüsü yapısı
        }) {
            Text(text = "Tıkla")
        }
        Button(onClick = {

            //val sayacMesaj = sayac.value.toString()
            //navController.navigate("detaySayfa/$sayacMessage")

            /*if(sayac.value == 10) {
                navController.navigate("detaySayfa/Aleyna")
            }*/
            //navcontroller ile geçiş sağlanır bu yüzden parametre olarak çek, sayfa feçişi yapmak istediği yerlere ekle
            //ne göndermek istiyorsan ony yaz
            navController.navigate("detaySayfa/Merhaba")
            {
                popUpTo("anasayfa"){inclusive=true}
                //backstack denilen arka yağın yapısını silmek için, yani 3 sayfamız varsa 3den dönerken 2 1 yağmaya gerek olmadan direkt 1e dönebilmek adına, arka yığını tutmasın diye
            }
        }) {
            Text(text = "Detay")
        }
    }
}