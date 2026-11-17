# Ödev: Java – Karar Yapıları ve Döngüler

> Bu bir ödev şablonudur. Ödevi **yapay zekâ kullanmadan**, kendi başınıza yapmanız beklenir.

`if`, `else if`, `else`, `switch`, `for`, `while` ve `do-while` yapılarını kullanarak 10 problemi çözeceksiniz.

## Repo Yapısı

```
.
├── README.md                    -> Ödev tanımı (bu dosya)
├── RAPOR.md                     -> Test sonuçlarını yazacağınız rapor
└── src/
    ├── Soru01_SayilariYazdir.java
    ├── ...
    └── Soru10_MenuProgrami.java -> Her soru için ayrı sınıf
```

## Nasıl Çalıştırılır?

```bash
javac src/Soru01_SayilariYazdir.java
java -cp src Soru01_SayilariYazdir
```

## Sorular

1. **1'den N'e Kadar Sayılar:** Kullanıcıdan N alın, 1'den N'e kadar tüm sayıları yazdırın.
2. **Çift ve Tek Sayıların Toplamı:** N alın, 1 ile N arasındaki çift ve tek sayıların toplamlarını ayrı ayrı hesaplayın.
3. **Çarpım Tablosu:** Bir sayı alın, 1'den 10'a kadar çarpım tablosunu oluşturun.
4. **Faktöriyel Hesaplama:** Bir tam sayı alın, faktöriyelini hesaplayın. Negatif girişleri kontrol edin.
5. **Sayının Basamaklarını Bulma:** Bir tam sayı alın, kaç basamaklı olduğunu hesaplayın.
6. **Sayıyı Ters Çevirme:** Bir tam sayı alın, basamaklarını ters sırada yazdırın (1234 → 4321).
7. **Asal Sayı Kontrolü:** Bir sayı alın, asal olup olmadığını belirleyin.
8. **Tahmin Oyunu:** Programın belirlediği sabit gizli sayıyı kullanıcı tahmin etsin. Her tahminde sayının büyük veya küçük olduğu söylensin. Doğru tahmine kadar devam etsin.
9. **Sayıların Ortalaması:** 10 sayı alın. Toplamı, aritmetik ortalamayı, ayrıca kaç tanesinin pozitif, negatif ve sıfır olduğunu bulun.
10. **Menü Tabanlı İşlem Programı:** Kullanıcı çıkana kadar şu menüyü gösterin. Geçersiz seçimleri kontrol edin.
    - 1: Bir sayının karesini hesapla
    - 2: Bir sayının küpünü hesapla
    - 3: Bir sayının tek veya çift olduğunu kontrol et
    - 4: Bir sayının pozitif, negatif veya sıfır olduğunu belirle
    - 5: Programdan çık

## Teslim Kuralları

- 10 sorunun tamamı çözülmelidir.
- Her soru ayrı bir sınıf olmalıdır (şablonda hazır).
- Her program en az **2 farklı test senaryosuyla** denenmeli ve `RAPOR.md` dosyasına yazılmalıdır.
- Sınır durumları ve hatalı girişler göz önünde bulundurulmalıdır.
- Kodlar düzenli ve okunabilir olmalıdır.

## Önemli

Ödev **bireyseldir**. Yapay zekâ araçlarından kod, algoritma veya çözüm desteği almak **yasaktır**. Teslimler AI detector ile kontrol edilecektir. Her öğrenci kendi çözümünü oluşturmalı ve kodunu açıklayabilmelidir.

Bu repoyu kendi hesabınıza kopyalayın, çalışmanızı commit'leyip sistemin belirttiği şekilde teslim edin.
