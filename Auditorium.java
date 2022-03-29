public class Auditorium
{
    public static void main (String[] args)
{
    Hall_class hall=new Hall_class();
    Booking_class booking=new Booking_class();
    Payment_class payment=new Payment_class();
    Customers_class customers=new Customers_class();
    Inventory_class inventory=new Inventory_class();
    Bill_class bill=new Bill_class();
}
class Hall_class
{
    int hall_id,hall_charge;
    String hall_name,hall_place,hall_type,hall_description;    
}

class Booking_class
{
    int booking_id;
    String booking_title,booking_type,booking_hall,booking_description;
    Date booking_date;
}

class Payment_class
{
    int payment_id,payment_customer_id,payment_amount;
    String payment_description;
    Date payment_date;
}

class Customers_class
{
    int customer_id,customer_mobile;
    String customer_name,customer_email,customer_username,customer_password,customer_address;
}

class Inventory_class
{
    int inventory_id,inventory_number;
    String inventory_items,inventory_type,inventory_description;   
}

class Bill_class
{
    int bill_id,bill_customer_id,bill_number;
    String bill_type,bill_receipt,bill_desscription;
}

}



