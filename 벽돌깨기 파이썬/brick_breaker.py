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
