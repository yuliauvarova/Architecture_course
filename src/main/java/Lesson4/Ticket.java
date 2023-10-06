package Lesson4;

import java.util.Date;

// Абстрактный класс и наследование
abstract class Ticket implements TicketActions {
    String routeId;
    Date departureTime;
    double price;


}

/**
 * Абстрактный класс Ticket, имплементирующий интерфейс TicketActions
 *
 * @param routeId - номер маршрута
 * @param departureTime - время отправления
 * @param price - стоимость билета
 */
