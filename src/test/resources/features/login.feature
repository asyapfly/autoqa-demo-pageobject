Feature: Login User
  Login User

  Scenario: Login User
    Then Click "Личный кабинет" button
    Then Input Login
    Then Input PassWord
    Then Click Войти ".auth__button"
    Then Content with "Владелец лицевого счета:" visible
