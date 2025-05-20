#include <stdio.h>
#include <conio.h>
#include <windows.h>

#define WIDTH 40
#define HEIGHT 20
#define PADDLE_WIDTH 7
#define BRICK_ROWS 3
#define BRICK_COLS 10

int ballX = WIDTH / 2;
int ballY = HEIGHT - 3;
int ballDirX = -1;
int ballDirY = -1;

int paddleX = WIDTH / 2 - PADDLE_WIDTH / 2;

int bricks[BRICK_ROWS][BRICK_COLS];

void gotoxy(int x, int y) {
    COORD pos = {x, y};
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), pos);
}

void draw() {
    system("cls");

    // 벽돌
    for (int i = 0; i < BRICK_ROWS; i++) {
        for (int j = 0; j < BRICK_COLS; j++) {
            if (bricks[i][j]) {
                gotoxy(j * 4 + 2, i + 1);
                printf("####");
            }
        }
    }

    // 경계
    for (int i = 0; i <= HEIGHT; i++) {
        gotoxy(0, i);
        printf("|");
        gotoxy(WIDTH, i);
        printf("|");
    }

    // Paddle
    gotoxy(paddleX, HEIGHT - 1);
    for (int i = 0; i < PADDLE_WIDTH; i++) {
        printf("=");
    }

    // Ball
    gotoxy(ballX, ballY);
    printf("O");
}

void input() {
    if (_kbhit()) {
        char ch = _getch();
        if (ch == 'a' && paddleX > 1) paddleX--;
        if (ch == 'd' && paddleX < WIDTH - PADDLE_WIDTH) paddleX++;
    }
}

void logic() {
    ballX += ballDirX;
    ballY += ballDirY;

    // 벽 충돌
    if (ballX <= 1 || ballX >= WIDTH - 1) ballDirX *= -1;
    if (ballY <= 0) ballDirY *= -1;

    // 패들 충돌
    if (ballY == HEIGHT - 2 && ballX >= paddleX && ballX <= paddleX + PADDLE_WIDTH) {
        ballDirY *= -1;
    }

    // 벽돌 충돌
    for (int i = 0; i < BRICK_ROWS; i++) {
        for (int j = 0; j < BRICK_COLS; j++) {
            int brickX = j * 4 + 2;
            int brickY = i + 1;
            if (bricks[i][j] && ballY == brickY && ballX >= brickX && ballX < brickX + 4) {
                bricks[i][j] = 0;
                ballDirY *= -1;
            }
        }
    }

    // 게임 오버
    if (ballY >= HEIGHT) {
        gotoxy(WIDTH / 2 - 5, HEIGHT / 2);
        printf("GAME OVER!");
        Sleep(2000);
        exit(0);
    }
}

void initBricks() {
    for (int i = 0; i < BRICK_ROWS; i++) {
        for (int j = 0; j < BRICK_COLS; j++) {
            bricks[i][j] = 1;
        }
    }
}

int main() {
    initBricks();
    while (1) {
        draw();
        input();
        logic();
        Sleep(50);  // 게임 속도 조절
    }
    return 0;
}
