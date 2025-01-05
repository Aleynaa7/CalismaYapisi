package com.example.calismayapisi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calismayapisi.ui.screens.Anasayfa
import com.example.calismayapisi.ui.screens.BottomBarSayfa
import com.example.calismayapisi.ui.screens.SayfaGecisleri
import com.example.calismayapisi.ui.theme.CalismaYapisiTheme

class MainActivity : ComponentActivity() { //() varsa kalıtımdı, artık bunları okuman lazım
    //onCreate yaşam döngüsü (life cycle) fonksiyonudur, ilk işlemler burada yapılır
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge() //tam yayılmasını sağlar, yukardaki durum çubukları wifi gözükme yeri vs değişiklik yaratır görünmesi açısından
        setContent {
            CalismaYapisiTheme {
                //ara yüze sabitlemek için scaffold gibi yapılar kullanılacak, appbar vs için mesela

                //burası genelde tasarımsal şeyler için deil de ana yerimiz olaraktır, başka yerde oluşturup burada çekilir, altta aslında olan preview gibi fonk lar da
                //ana sayfa ve detay sayfası olur
                //Anasayfa() yerine sayfagecişleri çalıştır, ilk o olacak zaten orada da start anasayfa
                //SayfaGecisleri("ayarlar")
                BottomBarSayfa()

                //emulatör kısmında kaydırarak geri yapılabilir: backstack (arkayön) denir, istersen bu özelliği silebilirsin
            }
        }
    }
}

//sayfalar arası veri çekme diye bi kavram yok veri transferi var : bi sayfadaki veriyi diperine alma

//composable fonk'lar, class ve dosya isimleri büyük başlar
//hep isimler mantıklı anlaşılır olsun, şirketler dikkat eder
//yorum satırları değşken nesne isimleri anlamlı olsun, yorum uzun olmasın bol olsun
