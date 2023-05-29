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
                <a href="#" class="logo d-flex align-items-center w-auto">
                  <img src="#" alt="">
                  <span class="d-none d-lg-block">Добро пожаловать</span>
                </a>
              </div>
              <div class="card mb-3">
                <div class="card-body p-5">
                  <div class="col-12 mb-3">
                    <button @click.prevent="$router.push('/login')" class="btn btn-primary w-100" type="submit">
                      Войти
                    </button>
                  </div>
                  <div class="col-12">
                    <button @click.prevent="$router.push('/register')" class="btn btn-primary w-100" type="submit">
                      Зарегистрироваться
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>
  </main>
</template>