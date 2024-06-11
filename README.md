# Selenium-Cucumber
Kerangka pengujian UI Web menggunakan Cucumber, Java, Gradle, Selenium dengan spesifikasi yang digunakan sebagai berikut
- JAVA 8
- Selenium Java v4.11.0
- WebDriverManager v5.7.0
- Cucumber v7.15.0
- Junit Jupiter v5.9.0
- Chrome v125.xx
- Gradle v7.5.1
- InteliJ Idea
- Allure
- Scoop

Pembuatan project ini bertujuan untuk pengujian Web secara automation untuk aplikasi https://www.saucedemo.com/
Tahap-tahap yang dilakukan untuk membuat project tersebut:
1. depedencies Selenium, WebDriverManager, Cucumber, Junit yang akan di simpan pada file build.gradle
   
  ![Screenshot 2024-06-11 212828](https://github.com/romirosmawati/SeleniumCucumber/assets/32626103/6e30d135-8a96-4532-a1fd-1a80fe00a447)

3. set konfigurasi pada build.gradle seperti dibawah ini

   configurations {
    cucumberRuntime {
        extendsFrom testImplementation
    }
  }

4. buat file Gherkin format untuk fitur login
5. buat step definitation dari scenario pada file gherkin
6. buat class LoginPage dan HomePage
7. buat class CucumberTest dan tambahkan option plugin pretty untuk membuat report menjadi lebih readable
   ![Screenshot 2024-06-11 213150](https://github.com/romirosmawati/SeleniumCucumber/assets/32626103/121f0bd0-0d81-4cbf-9049-cb2a901c8f73)

8. cara menjalankan project ini dengan run class CucumberTest dan logs akan muncul pada tab Terminal
9. Hasil yang akan didapatkan sebagai berikut
10. Hasil report yang sudah dibuat
![Screenshot 2024-06-11 205022](https://github.com/romirosmawati/SeleniumCucumber/assets/32626103/f31245bd-10e4-472c-a09d-5f2f1af9671b)
