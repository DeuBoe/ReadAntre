package id.deuboe.readantre.tab.mandiri;


public class Model {

  private String name, ktp, dateOfBirth, profession, idKtp, address, idPowerOfAttorney, date, spinner, id, sort, today;

  public Model() {

  }

  public Model(
      String name,
      String ktp,
      String dateOfBirth,
      String profession,
      String idKtp,
      String address,
      String idPowerOfAttorney,
      String date,
      String spinner,
      String id,
      String sort,
      String today) {
    this.name = name;
    this.ktp = ktp;
    this.dateOfBirth = dateOfBirth;
    this.profession = profession;
    this.idKtp = idKtp;
    this.address = address;
    this.idPowerOfAttorney = idPowerOfAttorney;
    this.date = date;
    this.spinner = spinner;
    this.id = id;
    this.sort = sort;
    this.today = today;
  }

  public String getName() {
    return name;
  }

  public String getKtp() {
    return ktp;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public String getProfession() {
    return profession;
  }

  public String getIdKtp() {
    return idKtp;
  }

  public String getAddress() {
    return address;
  }

  public String getIdPowerOfAttorney() {
    return idPowerOfAttorney;
  }

  public String getDate() {
    return date;
  }

  public String getSpinner() {
    return spinner;
  }

  public String getId() {
    return id;
  }

  public String getSort() {
    return sort;
  }

  public String getToday() {
    return today;
  }

}

