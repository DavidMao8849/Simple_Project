11주차 과제 

# 📌 간단한 프로젝트 기획서

---

## 🗂️ 1. 프로젝트 개요

- **프로젝트 명 : 벽돌깨기 게임 개발 구현**
- **작성자: 202025016 - 이은우**
- **기간: 2025.05.15~ 05.21**

---

## 🎯 2. 기획 배경 및 목적

> 왜 이 프로젝트를 하나?
> 
- 컴퓨터를 이용해 재밌게 했던 간단한 게임들(예로들면 지뢰찾기, 카드게임, 핀볼) 중에 기억에 남던 벽돌깨기가 생각났음.
- 이를 다양한 언어(JAVA, 파이썬, C언어)로 구현하여 비교분석을 하여 게임을 하는데에 최적의 언어를 찾고,  최종 개발 언어를 선정함.

> 어떤 문제를 해결하거나, 어떤 것을 만들고자 하나요?
> 
- 3가지의 언어를 이용하여 비교 분석할것이므로, 이 코드를 작성할 통합 개발 환경을 선정해야했음.<br>
해결방안 = VScode를 개발환경으로 선정하여 진행
- 언어별로 구현된 게임의 코드가 다르기 때문에 오류가 자주 발생하곤함.<br>
해결방안 = ChatGPT를 이용한 코드의 문제점 분석 및 수정함.

---

## 🗓️ 3. 일정 계획

| 날짜 / 기간 | 작업 내용 |
| --- | --- |
| 1일차 | 아이디어 정리 및 기획 |
| 2~3일차 | 기본 기능 구현 |
| 4일차 | 테스트 및 디버깅 |
| 5일차 | 보고서 작성 / 정리 |
- [x]  1일차 : 아이디어 정리 및 기획
- [x]  2~3일차 : 기본 기능 구현
- [x]  4일차 : 테스트 및 디버깅
- [x]  5일차 : 보고서 작성 / 정리

---

## ⚙️ 4. 주요 기능

- 기능 1: 벽돌깨기 게임이라는 이름에 맞게 깨 부술수 있는 벽돌을 생성
- 기능 2: 공을 이용해 벽돌을 부셔야 하므로 움직이는 공을 생성
- 기능 3: 공이 바깥으로 나가지 않고 튀기면서 벽돌을 부숴야 하므로 움직이는 패들도 생성

---

## 🛠️ 5. 언어별 비교 분석

### (1). **파이썬(Python)** - `pygame` 사용

![image](https://github.com/user-attachments/assets/069f320c-9152-4a3a-ae87-6089a9e7432c)
<br>
[코드 보기](https://www.notion.so/1f97f052d95180a08e7ee436b587fde1?pvs=21)

### ✔️ 장점

- **가독성 높음**: 코드 길이가 짧고 구조가 단순해 빠르게 구현 가능.
- **빠른 프로토타이핑**: `pygame`을 활용하면 UI/그래픽 작업을 간단히 구현.
- **커뮤니티/자료 풍부**: 초보자도 참고할 수 있는 자료가 많음.

### ❌ 단점

- **속도 느림**: 인터프리터 언어 특성상 성능이 낮음.
- **정적 타입 부재**: 큰 프로젝트에서 유지보수에 불리할 수 있음.
- **고성능 게임엔 부적합**: `pygame`은 단순한 게임에만 적합.

---

### (2). **자바(Java)** - `Swing` 기반 GUI

![image](https://github.com/user-attachments/assets/3976c5fd-2c79-4e87-929d-6adc9dd1ed00)
<br>
[코드보기](https://www.notion.so/1f97f052d95180a08e7ee436b587fde1?pvs=21)

### ✔️ 장점

- **객체지향적 설계**에 적합: 클래스 분할과 유지보수에 유리함.
- **정적 타입**: 코드 안정성과 오류 감소에 도움.
- **운영체제 독립적**: JVM만 있으면 어떤 OS에서도 실행 가능.

### ❌ 단점

- **GUI 코드가 장황함**: `Swing`은 복잡하고, UI 배치가 번거로움.
- **초기 설정이 번거로움**: 여러 파일로 **분리**되며 구조가 무거움.
- **성능이 완전히 좋진 않음**: 고급 게임엔 부적합.

---

### (3). **C 언어** - `graphics.h` 또는 `SDL` 등으로 구현

![image](https://github.com/user-attachments/assets/d630cc8e-678b-46e1-a016-763d2f908a31)
<br>
[코드보기](https://www.notion.so/1f97f052d95180a08e7ee436b587fde1?pvs=21)

### ✔️ 장점

- **고성능**: 가장 빠름. 하드웨어에 가까워 직접 제어 가능.
- **자원 제어 가능**: 메모리, 연산 제어가 가능해 고성능 최적화에 적합.
- **게임 엔진 기초에 가까움**: 저수준 게임 구조 연습에 좋음.

### ❌ 단점

- **GUI 구현이 어려움**: 기본 코들 한계가 뚜렷하고, 별도 라이브러리 필요.
- **생산성 낮음**: 코드가 길고 버그 유발 가능성이 큼.
- **개발 속도 느림**: 포인터, 메모리 처리 등으로 구현이 복잡함.

---

## ✅ 6. 기대 결과

> 최종적으로 다음과 같이 세부적인 언어 비교 결과가 나옴
> 
> 
> 
> | 항목 | 파이썬 (`pygame`) | 자바 (`Swing`) | C 언어 (`console` 또는 `graphics.h`) |
> | --- | --- | --- | --- |
> | 개발 속도 | 🟢 빠름 | 🟡 보통 | 🔴 느림 |
> | 학습 곡선 | 🟢 쉬움 | 🟡 중간 | 🔴 어려움 |
> | 코드 길이 | 🟢 짧음 | 🔴 김 | 🟡 중간 |
> | 유지보수 | 🟡 약함 (스크립트) | 🟢 강함 (클래스 기반) | 🔴 약함 (포인터/로직 분산) |
> | 성능 | 🟡 보통 | 🟡 보통 | 🟢 우수 |
> | GUI 라이브러리 | 🟢 간단한 `pygame` | 🔴 무거운 `Swing` | 🔴 불편 (추가 설치 필요) |
> | 고급 게임 확장성 | 🔴 낮음 | 🟡 중간 | 🟢 높음 |

---

## 🏆 결론

최종적으로 하나의 언어를 선정하기 보단, 
3개의 언어가 어느 상황에 적절하게 사용해야 할지를 정리하였다.

| 상황 | 추천 언어 |
| --- | --- |
| 빠르게 게임을 만들고 싶다 | ✅ **파이썬** (`pygame`) |
| 구조화된 OOP 기반으로 개발하고 싶다 | ✅ **자바** (`Swing`) |
| 저수준까지 최적화된 성능을 다루고 싶다 | ✅ **C 언어** (with `SDL` or `OpenGL`) |

---

## 📎 참고 자료

## **파이썬(Python) 코드**

```python
import pygame
import sys
import random

# 초기화
pygame.init()

# 화면 크기 설정
WIDTH = 600
HEIGHT = 500
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Brick Breaker")

# 색상 정의
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
RED = (200, 0, 0)
GREEN = (0, 200, 0)
BLUE = (0, 0, 200)

# 폰트 설정
font = pygame.font.SysFont("Arial", 24)

# 패들 설정
paddle_width = 100
paddle_height = 10
paddle_x = (WIDTH - paddle_width) // 2
paddle_y = HEIGHT - 30
paddle_speed = 7

# 공 설정
ball_size = 15
ball_x = WIDTH // 2
ball_y = HEIGHT // 2
ball_dx = 4 * random.choice([-1, 1])
ball_dy = -4

# 벽돌 설정
brick_rows = 5
brick_cols = 8
brick_width = 60
brick_height = 20
brick_padding = 10
brick_offset_x = 35
brick_offset_y = 50

bricks = []
for row in range(brick_rows):
    for col in range(brick_cols):
        brick_x = brick_offset_x + col * (brick_width + brick_padding)
        brick_y = brick_offset_y + row * (brick_height + brick_padding)
        bricks.append(pygame.Rect(brick_x, brick_y, brick_width, brick_height))

# 점수
score = 0

# 게임 루프
clock = pygame.time.Clock()
running = True
while running:
    clock.tick(60)  # 초당 프레임 설정
    screen.fill(BLACK)

    # 이벤트 처리
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # 키 입력 처리
    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT] and paddle_x > 0:
        paddle_x -= paddle_speed
    if keys[pygame.K_RIGHT] and paddle_x < WIDTH - paddle_width:
        paddle_x += paddle_speed

    # 공 이동
    ball_x += ball_dx
    ball_y += ball_dy

    # 공 벽 충돌
    if ball_x <= 0 or ball_x >= WIDTH - ball_size:
        ball_dx = -ball_dx
    if ball_y <= 0:
        ball_dy = -ball_dy

    # 공 바닥에 닿음 (게임 오버)
    if ball_y >= HEIGHT:
        print("Game Over")
        running = False

    # 공과 패들 충돌
    paddle_rect = pygame.Rect(paddle_x, paddle_y, paddle_width, paddle_height)
    ball_rect = pygame.Rect(ball_x, ball_y, ball_size, ball_size)
    if ball_rect.colliderect(paddle_rect):
        ball_dy = -ball_dy

    # 공과 벽돌 충돌
    for brick in bricks[:]:
        if ball_rect.colliderect(brick):
            bricks.remove(brick)
            ball_dy = -ball_dy
            score += 10
            break

    # 점수 출력
    score_text = font.render(f"Score: {score}", True, WHITE)
    screen.blit(score_text, (10, 10))

    # 패들 그리기
    pygame.draw.rect(screen, GREEN, paddle_rect)

    # 공 그리기
    pygame.draw.ellipse(screen, RED, ball_rect)

    # 벽돌 그리기
    for brick in bricks:
        pygame.draw.rect(screen, BLUE, brick)

    pygame.display.flip()

pygame.quit()
sys.exit()
```

## **자바(Java) 코드**

- **Main.java**

```java
public class Main {
    public static void main(String[] args) {
        new GameFrame();
    }
}
```

- **GameFrame.java**

```java
import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.setTitle("Brick Breaker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new GamePanel());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
```

- **GamePanel.java**

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

    private final int WIDTH = 600;
    private final int HEIGHT = 500;

    private Timer timer;
    private int delay = 8;

    private int paddleX = 250;
    private final int paddleWidth = 100;
    private final int paddleHeight = 10;

    private int ballX = 290;
    private int ballY = 350;
    private int ballDirX = -2;
    private int ballDirY = -3;
    private final int ballSize = 20;

    // 벽돌 관련
    private boolean[][] bricks;
    private final int brickRows = 5;
    private final int brickCols = 10;
    private final int brickWidth = 50;
    private final int brickHeight = 20;

    public GamePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(this);
        timer = new Timer(delay, this);
        timer.start();

        // 벽돌 초기화
        bricks = new boolean[brickRows][brickCols];
        for (int i = 0; i < brickRows; i++) {
            for (int j = 0; j < brickCols; j++) {
                bricks[i][j] = true;
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        // 배경
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // 벽돌 그리기
        for (int i = 0; i < brickRows; i++) {
            for (int j = 0; j < brickCols; j++) {
                if (bricks[i][j]) {
                    int brickX = j * (brickWidth + 10) + 35;
                    int brickY = i * (brickHeight + 10) + 30;
                    g.setColor(Color.orange);
                    g.fillRect(brickX, brickY, brickWidth, brickHeight);
                    g.setColor(Color.black);
                    g.drawRect(brickX, brickY, brickWidth, brickHeight);
                }
            }
        }

        // Paddle
        g.setColor(Color.green);
        g.fillRect(paddleX, HEIGHT - 50, paddleWidth, paddleHeight);

        // Ball
        g.setColor(Color.red);
        g.fillOval(ballX, ballY, ballSize, ballSize);
    }

    public void actionPerformed(ActionEvent e) {
        // Ball movement
        ballX += ballDirX;
        ballY += ballDirY;

        // Bounce off walls
        if (ballX < 0 || ballX > WIDTH - ballSize) ballDirX = -ballDirX;
        if (ballY < 0) ballDirY = -ballDirY;

        // Bounce off paddle
        if (new Rectangle(ballX, ballY, ballSize, ballSize).intersects(
                new Rectangle(paddleX, HEIGHT - 50, paddleWidth, paddleHeight))) {
            ballDirY = -ballDirY;
        }

        // Ball out of bounds
        if (ballY > HEIGHT) {
            // Reset ball position
            ballX = 290;
            ballY = 350;
            ballDirX = -2;
            ballDirY = -3;
        }

        // 벽돌 충돌 체크
        for (int i = 0; i < brickRows; i++) {
            for (int j = 0; j < brickCols; j++) {
                if (bricks[i][j]) {
                    int brickX = j * (brickWidth + 10) + 35;
                    int brickY = i * (brickHeight + 10) + 30;
                    Rectangle brickRect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                    Rectangle ballRect = new Rectangle(ballX, ballY, ballSize, ballSize);

                    if (ballRect.intersects(brickRect)) {
                        bricks[i][j] = false;
                        ballDirY = -ballDirY;
                        break;
                    }
                }
            }
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 0) {
            paddleX -= 20;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < WIDTH - paddleWidth) {
            paddleX += 20;
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
```

## **C 언어 코드**

```c
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
```
