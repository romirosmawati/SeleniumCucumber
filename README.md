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

Pembuatan project ini bertujuan untuk pengujian Web secara automation untuk aaplikasi https://www.saucedemo.com/
Tahap-tahap yang dilakukan untuk membuat project tersebut:
1. depenecies Selenium, WebDriverManager, Cucumber, Junit yang akan di simpan pada file build.gradle
  Selenium => implementation 'org.seleniumhq.selenium:selenium-java:4.11.0'
  WebDrivermanager => implementation 'io.github.bonigarcia:webdrivermanager:5.7.0'
  Cucumber => implementation 'io.cucumber:cucumber-java:7.15.0'
              testImplementation 'io.cucumber:cucumber-junit:7.15.0'
  jUnit => testImplementation 'org.junit.jupiter:junit-jupiter-api:5.9.0'
           testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.0'
2. set konfigurasi pada build.gradle seperti dibawah ini
   
   configurations {
    cucumberRuntime {
        extendsFrom testImplementation
    }
  }

3. buat file Gherkin format untuk fitur login
4. buat step definitation dari scenario pada file gherkin
5. buat class LoginPage dan HomePage
6. buat class CucumberTest dan tambahkan option plugin pretty untuk membuat report menjadi lebih readable
7. cara menjalankan project ini dengan run class CucumberTest dan logs akan muncul pada tab Terminal
8. Hasil yang akan didapatkan sebagai berikut
9. Hasil report yang sudah dibuat sebagai berikut
