package com.example.calismayapisi.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.calismayapisi.R

@Composable
fun BottomBarSayfa(){
    val secilenItem = remember { mutableStateOf(0) }

    Scaffold (
        bottomBar = {
            BottomAppBar (content = {
                NavigationBarItem(
                    selected = secilenItem.value == 0, //iki = kıyaslama: 0 ise
                    onClick = {
                        secilenItem.value = 0 //tek = değer aktarma 0 yap
                    },
                    label = { Text(text = "Anasayfa") },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.anasayfa_resim), contentDescription = ""
                        )
                    }
                )
                NavigationBarItem(
                    selected = secilenItem.value == 1,
                    onClick = {
                        secilenItem.value = 1
                    },
                    label = { Text(text = "Ayarlar") },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ayarlar_resim), contentDescription = ""
                        )
                    }
                )


            })


        }
    ) { paddingValues ->
        Column (modifier = Modifier.fillMaxSize().padding(paddingValues)){
            if (secilenItem.value == 0)
            {
                SayfaGecisleri(secilenSayfa = "anasayfa")
            }
            if (secilenItem.value == 1)
            {
                SayfaGecisleri(secilenSayfa = "ayarlar")
            }
        }

    }
}



//çalışma yapısı son konu: uygulama tasarladıktan sonra çıktı almak : APK: ders kaydından bak!!
//çıktı alıp telde kullanacaksak imzasız çıktı şifre kullanmadan
//markette kullanacaksan sign olan