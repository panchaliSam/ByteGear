# ByteGear

## 🔐 Auth Service

### Description

The **Auth Service** is responsible for handling authentication and authorization within the ByteBazaar microservices architecture. It provides secure endpoints for user registration, login, and token renewal using JWT and refresh tokens.

### ✨ Key Features

- ✅ User registration with role assignment (`USER`, `ADMIN`)
- ✅ Login with JWT-based access token generation
- ✅ Refresh token mechanism to renew expired access tokens securely
- ✅ Embedded user details in JWT (`id`, `email`, `role`)
- ✅ Password hashing with BCrypt
- ✅ Stateless session management using Spring Security
- ✅ Fully integrated with Eureka for service discovery

---

### 🔄 Refresh Token Mechanism

The Auth Service issues both:
- **Access Token:** Short-lived JWT (e.g., 15 mins – 1 hour), used to authenticate requests.
- **Refresh Token:** Long-lived token stored securely (e.g., 7 days), used to obtain new access tokens without requiring login again.

#### ✅ How it works:

1. After successful login or registration, both access and refresh tokens are returned.
2. The client stores them (e.g., access in memory, refresh in HTTP-only cookie).
3. When the access token expires, the client sends the refresh token to `/auth/refresh`.
4. If valid, a new access token is issued without prompting for credentials again.

