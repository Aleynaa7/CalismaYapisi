package com.example.calismayapisi.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun SayfaGecisleri(secilenSayfa:String){ //seçilen sayfayı string al ki bottom yaptığnda start syafası hangisin ebasarsan o olsun
    //ara fonk ile sayfa geçişi sağlayacağız bunun gibi bir şey ile
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = secilenSayfa){ //start kısmına yazılacak id ilk açılan sayfa olur
        composable("anasayfa"){ //burada tanımlanan idler sınıfları temsil eder
            Anasayfa(navController = navController) //sadece nvaController de yazabilirsin ama = ile yazmak daha iyi, iki paramtere varsa ikisine de navController gitmesin
        }
        composable("detaySayfa/{mesaj}",
            arguments = listOf(
                navArgument("mesaj", {type = NavType.StringType}) //hangi türle çalışmak istersen o stringtyope gibi
            )){ //veri göndemrke için /{} içine istediğin şeyi yaz : birden fazla için / ile devam edilir : slyatta var örnek
            val mesaj = it.arguments?.getString("mesaj")!! //mesaj değil başka isimle de tanımlanabilirdi
            DetaySayfa(mesaj = mesaj)
        }

        composable("ayarlar"){
             Ayarlar()
        }
    }
}