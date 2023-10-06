package Lesson4;



class BusTicket extends Ticket {

    /**
     * Класс BusTicket - билет на автобус
     *
     * @param number - номер билета
     */
    int number;

    @Override
    public boolean reserveTicket() {
        // Реализация метода


        return false;
    }

    @Override
    public boolean deductFunds() {
        // Реализация метода
        return false;
    }

    /**
     * Выдача подстверждения о покупке билета
     *
     * @return true, если покупка подтверждена, false - в противном случае.
     * @pre - билет должен быть забронирован
     * @pre - средства со счета должны быть списаны
     * @post - будет выдано подтверждение о покупке билета
     * <p>
     *     Этот метод позволяет выдать подстверждение о покупке билета, если бидет забронирован (isReserved) и
     *     и средства со счета покупателя списаны (deduct funds)
     * </p>
     */

    @Override
    public boolean confirmPurchase() {
        if (!isReserved()){
            return false;
        }
        if (!deductFunds()){
            return false;
        }
        return true;
    }

    private boolean isReserved(){
        return false;
    }

    @Override
    public void updateTicketAvailability() {
        // Реализация метода
    }

    @Override
    public boolean cancelReservation() {
        // Реализация метода
        return false;
    }
}
