<script setup>

</script>
<template>
  <main>
    <div class="container">

      <section class="section register min-vh-100 d-flex flex-column align-items-center justify-content-center py-4">
        <div class="container">
          <div class="row justify-content-center">
            <div class="col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-center">

              <div class="d-flex justify-content-center py-4">
                <a href="/" class="logo d-flex align-items-center w-auto">
                  <img src="#" alt="">
                  <span class="d-none d-lg-block">Python Course</span>
                </a>
              </div>

              <div class="card mb-3">

                <div class="card-body">

                  <div class="pt-4 pb-2">
                    <h5 class="card-title text-center pb-0 fs-4">Регистрация</h5>
                    <p class="text-center small">Введите вашу персональную информацию для создания аккаунта</p>
                  </div>

                  <form class="row g-3 needs-validation" novalidate>
                    <div class="col-12">
                      <label for="yourLastname" class="form-label">Фамилия</label>
                      <input type="text" name="lastname" class="form-control" id="yourLastname" required>
                      <div class="invalid-feedback">Введите вашу фамилию!</div>
                    </div>
                    <div class="col-12">
                      <label for="yourFirstname" class="form-label">Имя</label>
                      <input type="text" name="firstname" class="form-control" id="yourFirstname" required>
                      <div class="invalid-feedback">Введите ваше имя!</div>
                    </div>

                    <div class="col-12">
                      <label for="yourEmail" class="form-label">Email</label>
                      <div class="input-group has-validation">
                        <span class="input-group-text" id="inputGroupPrepend">@</span>
                        <input type="text" name="email" class="form-control" id="yourEmail" required>
                        <div class="invalid-feedback">Введите ваш email!</div>
                      </div>
                    </div>

                    <div class="col-12">
                      <label for="yourPassword" class="form-label">Пароль</label>
                      <input type="password" name="password" class="form-control" id="yourPassword" required>
                      <div class="invalid-feedback">Please enter your password!</div>
                    </div>

                    <div class="col-12">
                      <button class="btn btn-primary w-100" type="submit">Создать аккаунт</button>
                    </div>
                    <div class="col-12">
                      <p class="small mb-0">Уже есть аккаунт? <router-link :to="{name: 'Login'}">Войти</router-link></p>
                    </div>
                  </form>

                </div>
              </div>

            </div>
          </div>
        </div>
      </section>
    </div>
  </main>
</template>