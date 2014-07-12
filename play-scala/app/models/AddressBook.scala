package models


import anorm._
import play.api.db._
import play.api.db.DB
import play.api.Play.current
import anorm.SqlParser._

/**
 * Created by fin01 on 2014/07/12.
 */
case class AddressBook(id: Option[Long], name: String, age: Int, tel: String, address: String) {
  def add {
    DB.withConnection { implicit c =>
      val rownum = SQL("insert into AddressBook(name,age,tel,address) values ({name},{age},{tel},{address})")
        .on('name -> this.name, 'age -> this.age, 'tel -> this.tel, 'address -> this.address)
        .executeUpdate()
    }
  }
}

object AddressBook {
  val parsar = {
    get[Option[Long]]("id") ~
      get[String]("name") ~
      get[Int]("age") ~
      get[String]("tel") ~
      get[String]("address") map {
      case id ~ name ~ age ~ tel ~ address => AddressBook(id, name, age, tel, address)
    }
  }

  def all: List[AddressBook] = {
    DB.withConnection {
      implicit c =>
        val datas = SQL("select * from addressbook").as(AddressBook.parsar *)
        return datas
    }
  }
}
