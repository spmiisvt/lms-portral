<script setup>
import {ref, onMounted} from 'vue';
import DataTable from "primevue/datatable";
import Column from "primevue/column";

const data = ref([
      {
        id: 1,
        firstname: "Artem",
        lastname: "Smirnov"
      },
      {
        id: 2,
        firstname: "Fillip",
        lastname: "Moris"
      }
    ]
)
</script>
<template>
  <div class="grid">
    <div class="col-12">
      <div class="card">
        <h5>Студенты</h5>
        <DataTable
            :value="data"
            :rows="10"
            :paginator="true"
            class="p-datatable-gridlines"
            dataKey="id"
            >
          <Column field="firstname" header="Имя" style="min-width: 12rem"></Column>
          <Column field="lastname" header="Фамилия" style="min-width: 12rem"></Column>
        </DataTable>
      </div>
    </div>
  </div>
</template>