	
player1 = input("Please enter player1 name: ")
player2 = input("Please enter player2 name: ")
while True:

    p1_choice = input(player1 + ", do you want to choose rock, paper or scissors? ").lower()
    p2_choice = input(player2 + ", do you want to choose rock, paper or scissors? ").lower() 
    if p1_choice == p2_choice:
         print("It's a tie!")
    elif p1_choice == 'rock':
        if p2_choice == 'scissors':
          print("Rock wins!")
        else:
            print("Paper wins!")
    elif p1_choice == 'scissors':
            if p2_choice == 'paper':
                print("Scissors win!")
            else:
                print("Rock wins!")
    elif p1_choice == 'paper':
            if p2_choice == 'rock':
                print("Paper wins!")
            else:
             print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    one_More_Round=input("Do you want to play one more round?: Yes/No").lower()
    if(one_More_Round=="yes"):
        pass
    elif(one_More_Round=="no"):
        print("Thank you for playing")
        raise SystemExit
    else:
        print("Invalid input")
        raise SystemExit        


