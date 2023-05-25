#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define LADDER 1
#define SNAKE 2

int move(int *position, int dice) {
    int type = 0;
    *position += dice;
    if (*position == 3) {
        *position = 22;
        type = LADDER;
    } else if (*position == 5) {
        *position = 8;
        type = LADDER;
    } else if (*position == 11) {
        *position = 26;
        type = LADDER;
    } else if (*position == 20) {
        *position = 29;
        type = LADDER;
    } else if (*position == 17) {
        *position = 4;
        type = SNAKE;
    } else if (*position == 19) {
        *position = 7;
        type = SNAKE;
    } else if (*position == 21) {
        *position = 9;
        type = SNAKE;
    } else if (*position == 27) {
        *position = 1;
        type = SNAKE;
    }
    return type;
}

int main(void) {
    int position = 0, dice, type;
    srand(time(NULL));
    while (position < 30) {
        dice = rand() % 6 + 1;
        printf("You rolled a %d\n", dice);
        type = move(&position, dice);
        switch (type) {
            case LADDER:
                printf("You climbed a ladder to %d\n", position);
                break;
            case SNAKE:
                printf("You were swallowed by a snake to %d\n", position);
                break;
            default:
                printf("You are now on %d\n", position);
        }
    }
    printf("You won!");
    return 0;
}