<script setup>
import {RouterView } from 'vue-router'
import Header from "@/components/Header.vue";
import ASidebar from "@/components/admin/A-Sidebar.vue";



</script>

<template>
  <Header />
  <a-sidebar/>

  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Панель управления</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="#">Главная</a></li>
          <li class="breadcrumb-item active">Панель управления</li>
        </ol>
      </nav>
    </div>

    <section class="section dashboard">
      <RouterView/>
    </section>

  </main>


  <footer id="footer" class="footer">

  </footer>
</template>

<style scoped>

</style>
