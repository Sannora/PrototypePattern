/* Bir yazılım şirketinin işe alım verilerinin kayıtlı olduğu veritabanının arkayüz kod bloğu simülasyonu: */

/* İşe alınan çalışanlar; EmployeeRecord sınıfında isim, soyisim, çalışan numarası ve işe alım sözleşmelerinin bulunduğu
şekilde tutulur.
  Şirket politikası gereğince çalışanın sözleşmesi güncellenmesi durumunda dâhi işe girdiği sözleşmenin
orijinal hâli arşivde tutulmalıdır. Bunun için güncellemeleri, çalışanı tutan sınıf nesnesinin bizzat kendisinde yapmak
yerine sınıfın birebir kopyası olan bir örneğinde yapmak doğru olacaktır.*/

package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Melih";
        String surname = "HOCAOĞLU";
        int employeeId = 17092001;

        EmployeeRecord employee = new EmployeeRecord(name,surname,employeeId);

        EmployeeRecord originalContract = (EmployeeRecord) employee.getClone();

    }
}
